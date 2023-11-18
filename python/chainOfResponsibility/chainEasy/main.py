from chainOfResponsibility.chainEasy.carpenter import Carpenter
from chainOfResponsibility.chainEasy.designer import Designer
from chainOfResponsibility.chainEasy.finishingWorker import FinishingWorker
from chainOfResponsibility.chainEasy.iWorker import IWorker


def give_command(worker: IWorker, command: str):
    string: str = worker.execute(command)
    if string == '':
        print(command + ' - никто не умеет делать')
    else:
        print(string)

if __name__ == '__main__':
    designer = Designer()
    carpenter = Carpenter()
    finishingWorker = FinishingWorker()

    designer.set_next_worker(carpenter).set_next_worker(finishingWorker)

    give_command(designer, 'спроектировать дом')
    give_command(designer, 'класть кирпич')
    give_command(designer, 'клеить обои')

    give_command(designer, 'провести проводку')

