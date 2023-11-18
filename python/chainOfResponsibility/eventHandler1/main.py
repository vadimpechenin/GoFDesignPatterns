from chainOfResponsibility.eventHandler1 import Event
from chainOfResponsibility.eventHandler1.debugHandler import DebugHandler
from chainOfResponsibility.eventHandler1.keyHandler import KeyHandler
from chainOfResponsibility.eventHandler1.mouseHandler import MouseHandler
from chainOfResponsibility.eventHandler1.nullHandler import NullHandler
from chainOfResponsibility.eventHandler1.timerHandler import TimerHandler


def main():
    print("Handler Chain #1")
    handler1 = TimerHandler(KeyHandler(MouseHandler(NullHandler())))
    # вместо NullHandler можно передать None или ничего
    while True:
        event = Event.next()
        if event.kind == Event.TERMINATE:
            break
        handler1.handle(event)

    print("\nHandler Chain #2 (debugging)")
    handler2 = DebugHandler(handler1)
    while True:
        event = Event.next()
        if event.kind == Event.TERMINATE:
            break
        handler2.handle(event)

if __name__ == "__main__":
    main()