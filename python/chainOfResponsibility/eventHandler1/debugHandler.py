import sys

from chainOfResponsibility.eventHandler1.nullHandler import NullHandler


class DebugHandler(NullHandler):

    def __init__(self, successor=None, file=sys.stdout):
        super().__init__(successor)
        self.__file = file


    def handle(self, event):
        self.__file.write("*DEBUG*: {}\n".format(event))
        super().handle(event)