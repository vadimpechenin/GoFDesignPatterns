from command.example1.conveyor import Conveyor
from command.example1.iCommand import ICommand


class ConveyorWorkCommand(ICommand):
    #Класс включения конвейера
    #Включение и выключение ленты конвейера
    def __init__(self, conveyor: Conveyor):
        self.conveyor: Conveyor = conveyor

    def positive(self):
        self.conveyor.on()

    def negative(self):
        self.conveyor.off()