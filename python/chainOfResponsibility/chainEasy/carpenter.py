from chainOfResponsibility.chainEasy.absWorker import AbsWorker


class Carpenter(AbsWorker):
    def execute(self, command: str) -> str:
        if command == 'класть кирпич':
            return 'Плотник выполнил команду ' + command
        else:
            return super().execute(command)