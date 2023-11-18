from chainOfResponsibility.chainEasy.absWorker import AbsWorker


class FinishingWorker(AbsWorker):
    def execute(self, command: str) -> str:
        if command == 'клеить обои':
            return 'Рабочий внутренней отделки выполнил команду ' + command
        else:
            return super().execute(command)