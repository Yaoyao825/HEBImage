USE mybatis;

create table image
(
    id            int auto_increment comment 'image id ' primary key,
    image_url     varchar(2000)   default ''                null comment 'image_url',
    image_label   varchar(100)         default 0                 null comment 'image_label',
    create_time   timestamp    default CURRENT_TIMESTAMP null COMMENT 'create_time'

) comment 'image';

INSERT INTO mybatis.image (id, image_url, image_label, create_time) VALUES (1, 'https://www.google.com/search?q=goldendoodle&sxsrf=APwXEdf9HyRk0lc48o2dpwM5tJPQiFjp7A:1679883570819&source=lnms&tbm=isch&sa=X&ved=2ahUKEwj6uoL8hfv9AhVM66QKHf1PCJkQ0pQJegQIAxAC&biw=1728&bih=927&dpr=2#imgrc=ZDxwiG0M3pymJM', 'dog', '2023-03-24 14:48:58');
INSERT INTO mybatis.image (id, image_url, image_label, create_time) VALUES (2, 'https://en.wikipedia.org/wiki/Ragdoll#/media/File:Ragdoll_from_Gatil_Ragbelas.jpg', 'cat', '2023-03-24 15:17:22');
INSERT INTO mybatis.image (id, image_url, image_label, create_time) VALUES (3, 'https://www.google.com/search?q=ragdoll&sxsrf=APwXEde6mdlonaCeqc54LvAnT1e50MYMqA:1679883628005&source=lnms&tbm=isch&sa=X&ved=2ahUKEwjh6KSXhvv9AhXPuaQKHTBuD0wQ0pQJegQIBBAC&biw=1728&bih=927&dpr=2#imgrc=I-bTUjJxVp6VWM', 'cat', '2023-03-24 15:24:04');
INSERT INTO mybatis.image (id, image_url, image_label, create_time) VALUES (4, 'https://www.google.com/search?gs_ssp=eJzj4tVP1zc0TLIoMc1JTioyYPTiTkotyktNyc9PyUkFAHr2CS4&q=bernedoodle&oq=bernedo&aqs=chrome.1.69i57j46i131i433i457i512j0i20i263i512j0i131i433i512j0i512j0i402i650j0i131i433i512j0i512l2j0i271.2588j0j9&sourceid=chrome&ie=UTF-8#imgrc=1Z5YrzORcobNJM', 'dog', '2023-03-24 15:24:04');
INSERT INTO mybatis.image (id, image_url, image_label, create_time) VALUES (5, 'https://www.google.com/search?q=yorkie&sxsrf=APwXEdfV-w-1L_uZNQlALsmHMGu_T6cfWw:1679883460582&source=lnms&tbm=isch&sa=X&ved=2ahUKEwihjLrHhfv9AhUKHewKHRfSDRwQ0pQJegQIBBAC&biw=1728&bih=927&dpr=2#imgrc=tCWnD4LokkICgM', 'dog', '2023-03-24 15:35:32');
