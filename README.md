# Farmacie
 Sa se creeze o mini-aplicatie pentru gestiunea stocurilor de medicamente ale farmaciilor din cele 4 orase disponibile: Bucuresti, Cluj, Timisoara si Iasi.

Prima interfata contine posibilitatea de a selecta ce informatii dorim sa vedem: Farmaciile dintr-un oras si informatiile detaliate ale acesteia (numar de comenzi, suma totala, valoarea medie per comanda, medicamente comandate; toate fiind vizibile pentru o luna selectata) sau Medicamentele disponibile.

Diagrama contine schema tabelelelor, legaturile dintre acestea si campurile.

#Explicatie Diagrama# 

 ~Tabela farmacie este tabela principala a proiectului si are o relatie de compozitie cu tabela Stoc si Comanda prin intermediul cheii primiare data de Cod_F.
	
 ~Tabela Comanda are ca si cheie primara ID_Comanda, ce retine numarul unic al fiecarei comenzi. Legatura cu tabela Farmacie se realizeaza prin cheia strina Cod_F.
	
 ~Tabela Stoc nu are cheie primara. Ea realizeaza legatura dintre tabela Medicamente si tabela Farmacie-tab, adaugand un camp de cantitate pentru a stoca cantitatea disponibila pentru un medicament. Intre tabela Stoc si tabela Medicamente este o relatie de agregare de la Medicament la Stoc.
	
 ~Tabela Medicament are ca si cheie primara campul Cod_Med si stocheaza Id-ul medicamentului, numele si codul categoriei din care face parte.
	
 ~Tabela Categorie contine numele categoriei si codul categoriei, Cod_Cat, ca si cheie primara.
 
 Nota: Aplicatia verifica informatiile introduse si limiteaza posibilitatea introducerii erorilor ce pot cauza erori
