from command.example1.iCommand import ICommand
from typing import List, Deque

class Multipult:
    #Класс управления конвейером
    def __init__(self):
        self.__commands: List[ICommand] = [None, None]
        self.__history: Deque[ICommand] = []

    def set_command(self, button: int, command: ICommand):
        self.__commands[button] = command

    def press_on(self, button: int):
        self.__commands[button].positive()
        self.__history.append(self.__commands[button])

    def press_cancel(self):
        if len(self.__history) != 0:
            self.__history.pop().negative()