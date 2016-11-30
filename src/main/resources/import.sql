INSERT INTO pharmawizard_forum.USER_ROLE(type) VALUES ('USER');
  
INSERT INTO pharmawizard_forum.USER_ROLE(type) VALUES ('ADMIN');
  
INSERT INTO pharmawizard_forum.USER_ROLE(type) VALUES ('DBA');

INSERT INTO pharmawizard_forum.USER_PROFILE(username, password, name, email) VALUES ('sam','$2a$10$4eqIF5s/ewJwHK1p8lqlFOEm2QIA0S8g6./Lok.pQxqcxaBZYChRm', 'Sam','samy@xyz.com');

INSERT INTO pharmawizard_forum.USER_PROFILE_USER_ROLE(ID_USER, USER_ROLE_ID) SELECT user.id, profile.id_user FROM pharmawizard_forum.USER_ROLE user, pharmawizard_forum.USER_PROFILE profile where profile.username='sam' and user.type='ADMIN';

