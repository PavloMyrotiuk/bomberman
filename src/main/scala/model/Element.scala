package model

sealed class Element(x: Int, y: Int)

class Column(x: Int, y: Int) extends Element(x, y)

class Bomb(x: Int, y: Int) extends Element(x, y)

class Box(x: Int, y: Int) extends Element(x, y)
