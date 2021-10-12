set foreign_key_checks=0;

truncate table product;
truncate table feedback;

insert into product(`id`, `name`, `price`, `details`, `currency`)
values(110, 'luxury chair', 4500, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit', 'FRF'),
       (111, 'luxury chair', 4000, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit', 'USD'),
       (112, 'luxury chair', 6500, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit', 'NGN'),
       (113, 'luxury chair', 8500, 'Lorem ipsum dolor sit amet, consectetur adipiscing elit', 'NGN');

set foreign_key_checks=1;