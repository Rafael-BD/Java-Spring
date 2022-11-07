drop user 'user'@'localhost';

drop schema tabela;

create schema tabela;

use tabela;

create user 'user'@'localhost' identified by 'pass123';

grant select, insert, delete, update on tabela.* to user@'localhost';

create table sen_sensor (
  sen_id bigint primary key auto_increment,
  sen_data_hora datetime not null,
  sen_medicao float not null
);

insert into sen_sensor (sen_data_hora, sen_medicao)
    values ('2022-10-13 10:00', 25.4),
           ('2022-10-13 11:00', 24.8);