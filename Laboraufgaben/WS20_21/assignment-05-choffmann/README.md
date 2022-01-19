# 5. Übung zur Vorlesung Algorithmen  

## 1 - Asymptotische Laufzeiten
Geben Sie für die folgenden Aussagen jeweils an, ob diese wahr oder falsch sind. Beweisen Sie wahre Aussagen analog zum Beweis aus der Vorlesung.

1.  Sei ![f : \\mathbb{N}{} \\rightarrow \\mathbb{R}{}, f(x) = 10](https://latex.codecogs.com/png.latex?f%20%3A%20%5Cmathbb%7BN%7D%7B%7D%20%5Crightarrow%20%5Cmathbb%7BR%7D%7B%7D%2C%20f%28x%29%20%3D%202 "f : \\mathbb{N}{} \\rightarrow \\mathbb{R}{}, f(x) = 10") und ![g : \\mathbb{N}{}&#10;  \\rightarrow \\mathbb{R}{}, g(x) = 2x](https://latex.codecogs.com/png.latex?g%20%3A%20%5Cmathbb%7BN%7D%7B%7D%0A%20%20%5Crightarrow%20%5Cmathbb%7BR%7D%7B%7D%2C%20g%28x%29%20%3D%205x "g : \\mathbb{N}{}
  \\rightarrow \\mathbb{R}{}, g(x) = 2x"). Gilt ![f \\le\_{\\text{as}}g](https://latex.codecogs.com/png.latex?f%20%5Cle_%7B%5Ctext%7Bas%7D%7Dg "f \\le_{\\text{as}}g")? Gilt ![g \\le\_{\\text{as}}f](https://latex.codecogs.com/png.latex?g%20%5Cle_%7B%5Ctext%7Bas%7D%7Df "g \\le_{\\text{as}}f")?

2.  Sei ![f : \\mathbb{N}{} \\rightarrow \\mathbb{R}{}, f(x) = x + 3](https://latex.codecogs.com/png.latex?f%20%3A%20%5Cmathbb%7BN%7D%7B%7D%20%5Crightarrow%20%5Cmathbb%7BR%7D%7B%7D%2C%20f%28x%29%20%3D%20x%20%2B%202 "f : \\mathbb{N}{} \\rightarrow \\mathbb{R}{}, f(x) = x + 3") und ![g : \\mathbb{N}{}&#10;  \\rightarrow \\mathbb{R}{}, g(x) = 2x](https://latex.codecogs.com/png.latex?g%20%3A%20%5Cmathbb%7BN%7D%7B%7D%0A%20%20%5Crightarrow%20%5Cmathbb%7BR%7D%7B%7D%2C%20g%28x%29%20%3D%20x "g : \\mathbb{N}{}
  \\rightarrow \\mathbb{R}{}, g(x) = 2x"). Gilt ![f \\le\_{\\text{as}}g](https://latex.codecogs.com/png.latex?f%20%5Cle_%7B%5Ctext%7Bas%7D%7Dg "f \\le_{\\text{as}}g")? Gilt ![g \\le\_{\\text{as}}f](https://latex.codecogs.com/png.latex?g%20%5Cle_%7B%5Ctext%7Bas%7D%7Df "g \\le_{\\text{as}}f")?


Nutzen Sie bei den Beweisen neben den üblichen Regeln für + und · nur die folgenden Regeln.

![\\begin{aligned}&#10;k \> 0 \\wedge m \< n & \\Rightarrow k \\cdot m \< k \\cdot n \\label{eq1}\\\\&#10;m \< n   & \\Rightarrow k + m \< k + n \\label{eq2}\\\\&#10;k \\ge 0 \\wedge m \\le n & \\Rightarrow k \\cdot m \\le k \\cdot n \\label{eq3}\\\\&#10;m \\le n & \\Rightarrow k + m \\le k + n \\label{eq4}\\end{aligned}](https://latex.codecogs.com/png.latex?%5Cbegin%7Baligned%7D%0Ak%20%3E%200%20%5Cwedge%20m%20%3C%20n%20%26%20%5CRightarrow%20k%20%5Ccdot%20m%20%3C%20k%20%5Ccdot%20n%20%5Clabel%7Beq1%7D%5C%5C%0Am%20%3C%20n%20%20%20%26%20%5CRightarrow%20k%20%2B%20m%20%3C%20k%20%2B%20n%20%5Clabel%7Beq2%7D%5C%5C%0Ak%20%5Cge%200%20%5Cwedge%20m%20%5Cle%20n%20%26%20%5CRightarrow%20k%20%5Ccdot%20m%20%5Cle%20k%20%5Ccdot%20n%20%5Clabel%7Beq3%7D%5C%5C%0Am%20%5Cle%20n%20%26%20%5CRightarrow%20k%20%2B%20m%20%5Cle%20k%20%2B%20n%20%5Clabel%7Beq4%7D%5Cend%7Baligned%7D "\\begin{aligned}
k \> 0 \\wedge m \< n & \\Rightarrow k \\cdot m \< k \\cdot n \\label{eq1}\\\\
m \< n   & \\Rightarrow k + m \< k + n \\label{eq2}\\\\
k \\ge 0 \\wedge m \\le n & \\Rightarrow k \\cdot m \\le k \\cdot n \\label{eq3}\\\\
m \\le n & \\Rightarrow k + m \\le k + n \\label{eq4}\\end{aligned}")  

**Hinweis:** Bitte laden Sie ein Foto ihrer Lösung bei GitHub hoch. Sie können dazu einfach das Web-Interface von GitHub nutzen.

