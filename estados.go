package main

import (
	"fmt"
)

type Estados struct {
	nome string
	populacao int
	capital string
}

func main() {
	estados := make(map[string]Estados, 6)
	estados["GO"] = Estados{"Goias", 6436052, "Goiania"}
	estados["PB"] = Estados{"Paraiba", 10997462, "Joao Pessoa"}
	estados["PR"] = Estados{"Parana", 10997462, "Curitiba"}
	estados["RN"] = Estados{"Rio Grande do Norte", 10997462, "Natal"}
	estados["AM"] = Estados{"Amazonas", 10997462, "Alagoas"}
	estados["SE"] = Estados{"Sergipe", 10997462, "Aracaju"}

	//for sigla, estado := range estados {
	//	fmt.Printf("%s (%s) possui %d habitantes. \n", estado.nome, sigla, estado.populacao)
	//}

	quadrados := make(map[int]int, 15)

	for i := 1; i <= 15; i++ {
		quadrados[i] = i * i
	}

	for n, quadrado := range quadrados {
		fmt.Printf("%d^2 = %d\n", n, quadrado)
	}
}