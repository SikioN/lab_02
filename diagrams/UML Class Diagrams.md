classDiagram
direction BT
class BrutalSwing
class ChargeBeam
class Charm
class Coil
class DamageMove
class Dedenne
class Eelektrik
class Eelektross
class Facade
class Main
class Move
class Onix
class PhysicalMove
class Pokemon
class Rest
class Spark
class SpecialMove
class StatusMove
class Steelix
class StoneEdge
class Swagger
class Thunder
class ThunderFang
class ThunderWave
class Tynamo

BrutalSwing  -->  PhysicalMove 
ChargeBeam  -->  SpecialMove 
Charm  -->  StatusMove 
Coil  -->  StatusMove 
DamageMove  -->  Move 
Dedenne  -->  Pokemon 
Eelektrik  -->  Tynamo 
Eelektross  -->  Eelektrik 
Facade  -->  PhysicalMove 
Onix  -->  Pokemon 
PhysicalMove  -->  DamageMove 
Rest  -->  StatusMove 
Spark  -->  PhysicalMove 
SpecialMove  -->  DamageMove 
StatusMove  -->  Move 
Steelix  -->  Onix 
StoneEdge  -->  PhysicalMove 
Swagger  -->  StatusMove 
Thunder  -->  SpecialMove 
ThunderFang  -->  PhysicalMove 
ThunderWave  -->  StatusMove 
Tynamo  -->  Pokemon 
