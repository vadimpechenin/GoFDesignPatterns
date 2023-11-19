import abc
from typing import List, Deque


class ICommand(metaclass=abc.ABCMeta):
    @abc.abstractmethod
    def positive(self):
        pass

    @abc.abstractmethod
    def negative(self):
        pass