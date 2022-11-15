select product_name from my_db.customers c
join my_db.orders o on c.id=o.customer_id
where name like lower(:name);

