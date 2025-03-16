# Programming –opdracht While loop 2 - Gemiddelde

## Beschrijving basisversie
Schrijf een applicatie die het gemiddelde uitrekent van twee of meer getallen. De gebruiker wordt altijd gevraagd om twee getallen te geven. Daarna wordt gevraagd of het om meer getallen gaat. Zolang de gebruiker ja zegt, gaat dit door. Als de gebruiker nee zegt, dan geeft het programma als resultaat het gemiddelde van de getallen.

Zie hier twee voorbeelden van input/output van deze applicatie. Input die de gebruiker invoert is schuin en onderstreept.

```
Dit programma berekent het gemiddelde van twee of meer getallen.
Geef het eerste getal: 34
Geef het tweede getal: 15
Wil je van meer getallen het gemiddelde bepalen (ja/nee)? nee
Het gemiddelde van jouw 2 getallen is 24.5
```

```
Dit programma berekent het gemiddelde van twee of meer getallen.
Geef het eerste getal: 21
Geef het tweede getal: 8
Wil je van meer getallen het gemiddelde bepalen (ja/nee)? ja
Geef het volgende getal: 13
Wil je van meer getallen het gemiddelde bepalen (ja/nee)? ja
Geef het volgende getal: 5
Wil je van meer getallen het gemiddelde bepalen (ja/nee)? nee
Het gemiddelde van jouw 4 getallen is 11.75
```

### Hints
- Gebruik variabelen voor het opslaan van de som van de getallen en het aantal getallen, zodat je het gemiddelde uit kunt rekenen.
- Gebruik een loop die doorloopt zolang de gebruiker 'ja' antwoordt. Pas elke keer als de loop doorloopt de som van de getallen aan en het aantal.
- Let op: Strings kun je niet vergelijken met ==, je hebt daarvoor de equals() methode nodig.

## Beschrijving gevorderde versie
Breid het programma uit met een test of de gebruiker geen onzin antwoord geeft. Als niet 'ja' of 'nee' geantwoord wordt, dan moet opnieuw gevraagd worden of er nog een getal bij komt. Bekijk de uitvoer hieronder voor een voorbeeld:

```
Dit programma berekent het gemiddelde van twee of meer getallen.
Geef het eerste getal: 21
Geef het tweede getal: 8
Wil je van meer getallen het gemiddelde bepalen (ja/nee)? jo
Je moet 'ja' of 'nee' antwoorden.
Wil je van meer getallen het gemiddelde bepalen (ja/nee)? ja
Geef het volgende getal: 13
Wil je van meer getallen het gemiddelde bepalen (ja/nee)? ja
Geef het volgende getal: 5
Wil je van meer getallen het gemiddelde bepalen (ja/nee)? no
Je moet 'ja' of 'nee' antwoorden.
Wil je van meer getallen het gemiddelde bepalen (ja/nee)? nee
Het gemiddelde van jouw 4 getallen is 11.75
```

### Hints
- De vraag die 'ja' of 'nee' verwacht als antwoord, wordt steeds opnieuw gesteld tot het antwoord inderdaad 'ja' of 'nee' is. Anders gezegd: net zo lang als het antwoord niet 'ja' én niet 'nee' is. Je hebt dus een loop nodig voor de controle die binnen de loop staat waarin om steeds meer getallen wordt gevraagd

## Richtlijnen bij coderen (zie ook MIW code conventions)
- Zorg dat je naam en het doel van het programma bovenin staan (ICC #1).
- Gebruik de juiste inspringing (indentation) bij de lay-out (ICC #2).
- Let op juist gebruik hoofdletters en kleine letters (ICC #3).
- Gebruik goede namen (ICC #4).
- Voeg waar nodig commentaar toe dat inzicht geeft in je code (ICC#7).