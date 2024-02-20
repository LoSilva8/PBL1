import random

class GeradorLista:
    def __init__(self):
        pass

    def gerar_lista(self, tamanho):
        return [random.randint(1, 100) for _ in range(tamanho)]

    def imprim(self, lista):
        for num in lista:
            print(f"Numero: {num}")
            if num % 3 == 0:
                print("eh multiplo de 3")
            if num % 2 == 0:
                print("eh par")
            else:
                print("eh impar")
            print()

def main():
    gerador = GeradorLista()
    tamanho = int(input("Digite o tamanho da lista: "))
    lista = gerador.gerar_lista(tamanho)
    gerador.imprim(lista)

main()
