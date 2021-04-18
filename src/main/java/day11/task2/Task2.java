package day11.task2;

public class Task2 {
    public static void main(String[] args) {
/*
Воин атакует Паладина
Паладин атакует Мага
Шаман лечит Мага
Маг атакует Паладина, тип атаки М
Шаман атакует Воина, тип атаки Ф
Паладин лечит себя
Воин атакует Мага 5 раз

 */

        Warrior warrior = new Warrior();
        Paladin paladin =  new Paladin();
        Magician magician = new Magician();
        Shaman shaman = new Shaman();

        warrior.physicalAttack(paladin);
        paladin.physicalAttack(magician);
        shaman.healTeammate(magician);
        magician.magicalAttack(paladin);
        shaman.physicalAttack(warrior);
        paladin.healHimself();

        warrior.physicalAttack(magician);
        warrior.physicalAttack(magician);
        warrior.physicalAttack(magician);
        warrior.physicalAttack(magician);
        warrior.physicalAttack(magician);


    }
}
