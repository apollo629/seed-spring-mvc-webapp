DROP TABLE IF EXISTS USERS ;

CREATE TABLE users (
  username CHARACTER VARYING(50) NOT NULL,
  password CHARACTER VARYING(255) NOT NULL,
  enabled BOOLEAN NOT NULL,
  PRIMARY KEY (username)
);

commit ;

DROP TABLE IF EXISTS AUTHORITIES ;

CREATE TABLE authorities (
  username CHARACTER VARYING(50) NOT NULL,
  authority CHARACTER VARYING(50) NOT NULL,
  FOREIGN KEY (username) REFERENCES users(username)
);

commit ;


-- apollo user
-- md5("")
insert  into users        values ( 'apollo','e10adc3949ba59abbe56e057f20f883e',true );
insert  into authorities  values ( 'apollo','ROLE_ADMIN' );

commit;