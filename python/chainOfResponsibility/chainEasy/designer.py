from chainOfResponsibility.chainEasy.absWorker import AbsWorker


class Designer(AbsWorker):
    def execute(self, command: str) -> str:
        if command == 'спроектировать дом':
            return 'Проектировщик выполнил команду ' + command
        else:
            return super().execute(command)