class Grid:
    #Класс для рисования сетки
    def __init__(self, width, height):
        self.__cells = [["white" for _ in range(height)]
                        for _ in range(width)]


    def cell(self, x, y, color=None):
        #Служит как для чтения чвета ячейки (если color=None), так и для его задания
        if color is None:
            return self.__cells[x][y]
        self.__cells[x][y] = color


    @property
    def rows(self):
        return len(self.__cells[0])


    @property
    def columns(self):
        return len(self.__cells)


    def as_html(self, description=None):
        table = ['<table border="1" style="font-family: fixed">']
        if description is not None:
            table.append('<tr><td colspan="{}">{}</td></tr>'.format(
                self.columns, description))
        for y in range(self.rows):
            table.append("<tr>")
            for x in range(self.columns):
                color = self.__cells[x][y]
                name = color if not color.startswith("light") else color[5:]
                char = (name[0].upper() if color != "white" else
                        '<font color="white">X</font>')
                table.append('<td style="background-color: {}">{}</td>'
                        .format(color if color != "red" else "pink", char))
            table.append("</tr>")
        table.append("</table>")
        return "\n".join(table)