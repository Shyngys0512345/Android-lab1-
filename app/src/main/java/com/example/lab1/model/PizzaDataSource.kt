package com.example.lab1.model

import com.example.lab1.R

object PizzaDataSource {
    val pizzaList = arrayListOf<Pizza>(
        Pizza(
            title = "Вау! Кебаб",
            description = "Мясо говядины, соус ранч, сыр моцарелла, сладкий перец, томаты, красный лук и фирменный томатный соус",
            cost = "2 900 ₸",
            image = R.drawable.img
        ),
        Pizza(
            title = "Баварская",
            description = "Острые колбаски чоризо, маринованные огурчики, красный лук, томаты, горчичный соус, моцарелла, фирменный томатный соус",
            cost = "2 700 ₸",
            image = R.drawable.img_1
        ),
        Pizza(
            title = "Пицца Жюльен",
            description = "Цыпленок, шампиньоны, ароматный грибной соус, лук, сухой чеснок, моцарелла, смесь сыров чеддер и пармезан, фирменный соус альфредо",
            cost = "2 700 ₸",
            image = R.drawable.img_2
        ),
        Pizza(
            title = "Миксик",
            description = "Пицца четвертинками с ветчиной из цыпленка, томатами, брынзой, моцареллой, фирменным соусом альфредо. Набор юного садовода в подарок",
            cost = "2 200 ₸",
            image = R.drawable.img_3
        ),
        Pizza(
            title = "Песто",
            description = "Сочный цыпленок с пикантным соусом песто, кубики брынзы, томаты, моцарелла и соус альфредо",
            cost = "2 700 ₸",
            image = R.drawable.img_4
        ),
        Pizza(
            title = "Додо",
            description = "Ветчина из цыпленка, сочные митболы, пепперони из цыпленка, томаты, шампиньоны, сладкий перец, красный лук, моцарелла, томатный соус и чеснок",
            cost = "2 900 ₸",
            image = R.drawable.img_5
        ),
        Pizza(
            title = "Карбонара",
            description = "Ветчина из цыпленка, сыры чеддер и пармезан, томаты, красный лучок, моцарелла, соус альфредо, чеснок и итальянские травы",
            cost = "2 400 ₸",
            image = R.drawable.img_6
        ),
        Pizza(
            title = "Аррива!",
            description = "Цыпленок, острая чоризо, соус бургер, сладкий перец, красный лук, томаты, моцарелла, соус ранч, чеснок",
            cost = "2 400 ₸",
            image = R.drawable.img_7
        )
    )
}
