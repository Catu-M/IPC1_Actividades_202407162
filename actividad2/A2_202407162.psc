Algoritmo palindromo
	Escribir "ingrese un n�mero entero"
	leer numero
	long<-Longitud(numero)
	
	inversa=""
	Para i<-long Hasta 1 Con Paso -1 Hacer
		inversa=inversa+SubCadena(numero,i,i)
	Fin Para
	
	escribir "el inverso de tu n�mero es " + inversa
	
	Si inversa=numero Entonces
		Escribir "su n�mero es palindromo"
	SiNo
		Escribir "su n�mero no es palindromo"
	Fin Si
	
	FinAlgoritmo
