from command.commandForGrid import Command
from command.commandForGrid.grid import Grid


class UndoableGrid(Grid):
    # Класс с двумя методами для того, чтобы можно было отменить операции
    # Поддерживает команды типа Command.Command и Command.Macro (второе с произвольным количеством команд)
    def create_cell_command(self, x, y, color):
        def undo():
            self.cell(x, y, undo.color)
        def do():
            # Сначала читаем цвет ячейки и запоминаем его в виде атрибута функции undo
            undo.color = self.cell(x, y) # Subtle!
            self.cell(x, y, color)
        return Command.Command(do, undo, "Cell")


    def create_rectangle_macro(self, x0, y0, x1, y1, color):
        macro = Command.Macro("Rectangle")
        for x in range(x0, x1 + 1):
            for y in range(y0, y1 + 1):
                macro.add(self.create_cell_command(x, y, color))
        return macro