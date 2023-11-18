import abc


class IWorker(metaclass=abc.ABCMeta):
    @abc.abstractmethod
    def set_next_worker(self, worker: 'IWorker') -> 'IWorker':
        pass
    @abc.abstractmethod
    def execute(self, command: str) -> str:
        pass