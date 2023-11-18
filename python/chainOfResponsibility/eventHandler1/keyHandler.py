from chainOfResponsibility.eventHandler1 import Event
from chainOfResponsibility.eventHandler1.nullHandler import NullHandler


class KeyHandler(NullHandler):

    def handle(self, event):
        if event.kind == Event.KEYPRESS:
            print("Press:   {}".format(event))
        else:
            super().handle(event)