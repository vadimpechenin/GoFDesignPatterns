from chainOfResponsibility.eventHandler1 import Event
from chainOfResponsibility.eventHandler1.nullHandler import NullHandler


class TimerHandler(NullHandler):

    def handle(self, event):
        if event.kind == Event.TIMER:
            print("Timeout: {}".format(event))
        else:
            super().handle(event)