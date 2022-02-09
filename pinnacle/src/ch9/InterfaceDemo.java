package ch9;

public class InterfaceDemo {

}
//Action Nouns - A noun with a concrete behavior - basically roles
//An action noun which depicts a role is an interface
interface Runner{}
interface Cook{}
interface Driver{}
interface Doctor{}
interface Engineer{}
interface Manufacturer{}
interface GentleMan{}
interface Teller{}

//Common nouns with a property of classifying things are abstract classes
//a common noun which depicts a classication is abstract class
abstract class ShoeFactory{}
abstract class Shoe{}
abstract class School{}
abstract class ShoeShop{}
abstract class Dominos{}
abstract class MedicalCollege{}
abstract class Bank{}

//General nouns/proper nouns which comes under some classfication are classes

//class BataShoeFactory extends ShoeFactory{}//batashoefactory is a kind of shoefactory
//class LeatherShoe extends Shoe{}//leather shoe is a kind of shoe

class BataShoeFactory extends ShoeFactory implements Manufacturer,GentleMan{//batashoefactory is a
	//kind of shoefactory and doing the job of manufacturing shoe or playing the role a shoe manufacturer
}

class LeatherShoe extends Shoe implements GentleMan{}
class StanleyMedicalCollege extends MedicalCollege implements Doctor{}
class IndianBank extends Bank implements Teller{}
