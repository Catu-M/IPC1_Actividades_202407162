Algoritmo palindromo
	Escribir "ingrese un número entero"
	leer numero
	long<-Longitud(numero)
	
	inversa=""
	Para i<-long Hasta 1 Con Paso -1 Hacer
		inversa=inversa+SubCadena(numero,i,i)
	Fin Para
	
	escribir "el inverso de tu número es " + inversa
	
	Si inversa=numero Entonces
		Escribir "su número es palindromo"
	SiNo
		Escribir "su número no es palindromo"
	Fin Si
	
	FinAlgoritmo
