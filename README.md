# Dépenses de l'État par habitant dans les différents pays de l'UE
Je me suis intéressé aux dépenses de l'État par habitant dans les différents pays de l'Union Européenne. 
Je pense que c'est un indicateur pertinent pour réaliser le poids réel de l'État.
Je trouve cet indicateur plus juste que le poids de la dépense publique dans le PIB, car il permet de comparer les pays sans tenir compte de la richesse de chacun.
![Dépenses de l'État par habitant dans les différents pays de l'UE](Dépenses%20par%20habitant.png)

## Sources :
- [Trading Economics](https://fr.tradingeconomics.com/country-list/gdp-per-capita?continent=europe) pour le PIB par habitant en dollars en 2023
- [INSEE](https://www.insee.fr/fr/statistiques/2381406) pour les dépenses publiques en pourcentage du PIB en 2023
- [Google Finance](https://www.google.com/finance/quote/USD-EUR) pour le taux de change dollar-euro (0,9452 au moment de l'écriture)

## Méthodologie :
1. Conversion du PIB par habitant en euros et formatage des données : [PIB par habitant.csv](PIB%20par%20habitant.csv)
2. Formatage des données des dépenses publiques en pourcentage du PIB : [Dépenses en fraction du PIB.csv](Dépenses%20en%20fraction%20du%20PIB.csv)
3. Calcul des dépenses de l'État par habitant : [Dépenses par habitant.csv](Dépenses%20par%20habitant.csv) (code des calculs [ici](src/main/kotlin/Générateur.kt))
4. Création d'un graphique pour visualiser les données avec Kandy : [Dépenses par habitant.ipynb](Dépenses%20par%20habitant.ipynb)