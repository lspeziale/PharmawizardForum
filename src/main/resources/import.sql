INSERT INTO pharmawizard_forum.user_role(type) VALUES ('USER');
  
INSERT INTO pharmawizard_forum.user_role(type) VALUES ('ADMIN');
  
INSERT INTO pharmawizard_forum.user_role(type) VALUES ('DBA');

INSERT INTO pharmawizard_forum.user_profile(username, password, name, email, roles) VALUES ('sam','$2a$10$4eqIF5s/ewJwHK1p8lqlFOEm2QIA0S8g6./Lok.pQxqcxaBZYChRm', 'Sam','samy@xyz.com', '2');

INSERT INTO pharmawizard_forum.user_profile_user_role(id_user,id_role)VALUES (1,2)

