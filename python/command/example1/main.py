from command.example1.conveyor import Conveyor
from command.example1.conveyorAdjustCommand import ConveyorAdjustCommand
from command.example1.conveyorWorkCommand import ConveyorWorkCommand
from command.example1.multipult import Multipult

if __name__ == '__main__':
    #Создание конвейера
    conveyor = Conveyor()
    #Создание пульта управления конвейером
    multipult = Multipult()
    #Установим пульт в нулевой адрес списка команд команду работы конвейера
    multipult.set_command(0, ConveyorWorkCommand(conveyor))
    # Установим пульт в первый адрес списка команд команду регулировки конвейера
    multipult.set_command(1, ConveyorAdjustCommand(conveyor))

    #Вызовем действие
    multipult.press_on(0)
    multipult.press_on(1)
    #Отменим действие
    multipult.press_cancel()
    multipult.press_cancel()
