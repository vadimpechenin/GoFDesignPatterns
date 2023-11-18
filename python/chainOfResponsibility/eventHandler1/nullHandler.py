class NullHandler:

    def __init__(self, successor=None):
        self.__successor = successor


    def handle(self, event):
        if self.__successor is not None:
            self.__successor.handle(event)