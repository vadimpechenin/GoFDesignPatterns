from chainOfResponsibility.eventHandler1 import Event
from chainOfResponsibility.eventHandler1.nullHandler import NullHandler


class MouseHandler(NullHandler):

    def handle(self, event):
        if event.kind == Event.MOUSE:
            print("Click:   {}".format(event))
        else:
            super().handle(event)