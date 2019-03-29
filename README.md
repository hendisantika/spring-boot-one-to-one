# spring-boot-one-to-one

Run this project by this command : `mvn clean spring-boot:run`

Spring Boot Console:
```
Hibernate: select wife0_.id as id1_1_, wife0_.husband_id as husband_3_1_, wife0_.name as name2_1_ from wife wife0_
Hibernate: select husband0_.id as id1_0_0_, husband0_.name as name2_0_0_, wife1_.id as id1_1_1_, wife1_.husband_id as husband_3_1_1_, wife1_.name as name2_1_1_ from husband husband0_ left outer join wife wife1_ on husband0_.id=wife1_.husband_id where husband0_.id=?
Hibernate: select wife0_.id as id1_1_1_, wife0_.husband_id as husband_3_1_1_, wife0_.name as name2_1_1_, husband1_.id as id1_0_0_, husband1_.name as name2_0_0_ from wife wife0_ left outer join husband husband1_ on wife0_.husband_id=husband1_.id where wife0_.husband_id=?
Hibernate: select husband0_.id as id1_0_0_, husband0_.name as name2_0_0_, wife1_.id as id1_1_1_, wife1_.husband_id as husband_3_1_1_, wife1_.name as name2_1_1_ from husband husband0_ left outer join wife wife1_ on husband0_.id=wife1_.husband_id where husband0_.id=?
Hibernate: select wife0_.id as id1_1_1_, wife0_.husband_id as husband_3_1_1_, wife0_.name as name2_1_1_, husband1_.id as id1_0_0_, husband1_.name as name2_0_0_ from wife wife0_ left outer join husband husband1_ on wife0_.husband_id=husband1_.id where wife0_.husband_id=?
Hibernate: select husband0_.id as id1_0_0_, husband0_.name as name2_0_0_, wife1_.id as id1_1_1_, wife1_.husband_id as husband_3_1_1_, wife1_.name as name2_1_1_ from husband husband0_ left outer join wife wife1_ on husband0_.id=wife1_.husband_id where husband0_.id=?
Hibernate: select wife0_.id as id1_1_1_, wife0_.husband_id as husband_3_1_1_, wife0_.name as name2_1_1_, husband1_.id as id1_0_0_, husband1_.name as name2_0_0_ from wife wife0_ left outer join husband husband1_ on wife0_.husband_id=husband1_.id where wife0_.husband_id=?
Hibernate: delete from wife where id=?
Hibernate: delete from husband where id=?
Hibernate: delete from wife where id=?
Hibernate: delete from husband where id=?
Hibernate: delete from wife where id=?
Hibernate: delete from husband where id=?
Hibernate: select husband0_.id as id1_0_, husband0_.name as name2_0_ from husband husband0_
Hibernate: insert into husband (name) values (?)
Hibernate: insert into wife (husband_id, name) values (?, ?)
Hibernate: insert into husband (name) values (?)
Hibernate: insert into wife (husband_id, name) values (?, ?)
Hibernate: insert into husband (name) values (?)
Hibernate: insert into wife (husband_id, name) values (?, ?)
Hibernate: select wife0_.id as id1_1_, wife0_.husband_id as husband_3_1_, wife0_.name as name2_1_ from wife wife0_
Hibernate: select husband0_.id as id1_0_0_, husband0_.name as name2_0_0_, wife1_.id as id1_1_1_, wife1_.husband_id as husband_3_1_1_, wife1_.name as name2_1_1_ from husband husband0_ left outer join wife wife1_ on husband0_.id=wife1_.husband_id where husband0_.id=?
Hibernate: select wife0_.id as id1_1_1_, wife0_.husband_id as husband_3_1_1_, wife0_.name as name2_1_1_, husband1_.id as id1_0_0_, husband1_.name as name2_0_0_ from wife wife0_ left outer join husband husband1_ on wife0_.husband_id=husband1_.id where wife0_.husband_id=?
Hibernate: select husband0_.id as id1_0_0_, husband0_.name as name2_0_0_, wife1_.id as id1_1_1_, wife1_.husband_id as husband_3_1_1_, wife1_.name as name2_1_1_ from husband husband0_ left outer join wife wife1_ on husband0_.id=wife1_.husband_id where husband0_.id=?
Hibernate: select wife0_.id as id1_1_1_, wife0_.husband_id as husband_3_1_1_, wife0_.name as name2_1_1_, husband1_.id as id1_0_0_, husband1_.name as name2_0_0_ from wife wife0_ left outer join husband husband1_ on wife0_.husband_id=husband1_.id where wife0_.husband_id=?
Hibernate: select husband0_.id as id1_0_0_, husband0_.name as name2_0_0_, wife1_.id as id1_1_1_, wife1_.husband_id as husband_3_1_1_, wife1_.name as name2_1_1_ from husband husband0_ left outer join wife wife1_ on husband0_.id=wife1_.husband_id where husband0_.id=?
Hibernate: select wife0_.id as id1_1_1_, wife0_.husband_id as husband_3_1_1_, wife0_.name as name2_1_1_, husband1_.id as id1_0_0_, husband1_.name as name2_0_0_ from wife wife0_ left outer join husband husband1_ on wife0_.husband_id=husband1_.id where wife0_.husband_id=?
Hibernate: select husband0_.id as id1_0_, husband0_.name as name2_0_ from husband husband0_
Hibernate: select wife0_.id as id1_1_1_, wife0_.husband_id as husband_3_1_1_, wife0_.name as name2_1_1_, husband1_.id as id1_0_0_, husband1_.name as name2_0_0_ from wife wife0_ left outer join husband husband1_ on wife0_.husband_id=husband1_.id where wife0_.husband_id=?
Hibernate: select wife0_.id as id1_1_1_, wife0_.husband_id as husband_3_1_1_, wife0_.name as name2_1_1_, husband1_.id as id1_0_0_, husband1_.name as name2_0_0_ from wife wife0_ left outer join husband husband1_ on wife0_.husband_id=husband1_.id where wife0_.husband_id=?
Hibernate: select wife0_.id as id1_1_1_, wife0_.husband_id as husband_3_1_1_, wife0_.name as name2_1_1_, husband1_.id as id1_0_0_, husband1_.name as name2_0_0_ from wife wife0_ left outer join husband husband1_ on wife0_.husband_id=husband1_.id where wife0_.husband_id=?
2019-03-30 06:44:41.802  INFO 7002 --- [           main] c.h.j.o.SpringJpaOneToOneApplication     : ===================Wifes:==================
Wife: name = Lisa has a husband with name = David
Wife: name = Mary has a husband with name = Peter
Wife: name = Lauren has a husband with name = Phillip
2019-03-30 06:44:41.804  INFO 7002 --- [           main] c.h.j.o.SpringJpaOneToOneApplication     : ===================Husbands:==================
Husband: name = David has a wife with name = Lisa
Husband: name = Peter has a wife with name = Mary
Husband: name = Phillip has a wife with name = Lauren
```