from command.example1.conveyor import Conveyor
from command.example1.iCommand import ICommand


class ConveyorAdjustCommand(ICommand):
    #Класс регулеровки конвейера
    #Снижение и увеличение скорости ленты конвейера
    def __init__(self, conveyor: Conveyor):
        self.conveyor: Conveyor = conveyor

    def positive(self):
        self.conveyor.speed_increase()

    def negative(self):
        self.conveyor.speed_decrease()