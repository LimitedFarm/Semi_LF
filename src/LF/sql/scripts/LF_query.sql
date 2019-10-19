INSERT INTO CUSTOMER VALUES(CID_SEQ.NEXTVAL, 'user01', '1234', '123123', '123123123', '123@123123', sysdate, sysdate, default, default);
INSERT INTO CUSTOMER VALUES(CID_SEQ.NEXTVAL, 'user02', '1234', '123123', '123123123', '123@123123', sysdate, sysdate, default, default);
INSERT INTO CUSTOMER VALUES(CID_SEQ.NEXTVAL, 'user03', '1234', '123123', '123123123', '123@123123', sysdate, sysdate, default, default);
INSERT INTO CUSTOMER VALUES(CID_SEQ.NEXTVAL, 'admin01', '1234', '123123', '123123123', '123@123123', sysdate, sysdate, 3, default);
INSERT INTO CUSTOMER VALUES(CID_SEQ.NEXTVAL, 'seller01', '1234', '123123', '123123123', '123@123123', sysdate, sysdate, 2, default);
INSERT INTO CUSTOMER VALUES(CID_SEQ.NEXTVAL, 'seller02', '1234', '123123', '123123123', '123@123123', sysdate, sysdate, 2, default);
INSERT INTO CUSTOMER VALUES(CID_SEQ.NEXTVAL, 'seller03', '1234', '123123', '123123123', '123@123123', sysdate, sysdate, 2, default);

INSERT INTO ADMIN VALUES(AID_SEQ.NEXTVAL,0, 4);

INSERT INTO SELLER VALUES(SID_SEQ.NEXTVAL, 'Y', '¹ÎÆ®ÃÊÄÚ', '123123', '123123', '123123', '123123', '123123', sysdate, sysdate, 5, NULL); 
INSERT INTO SELLER VALUES(SID_SEQ.NEXTVAL, 'Y', 'µþ±â', '123123', '123123', '123123', '123123', '123123', sysdate, sysdate, 6, NULL); 
INSERT INTO SELLER VALUES(SID_SEQ.NEXTVAL, default, '¹Ù³ª³ª', '123123', '123123', '123123', '123123', '123123', sysdate, sysdate, 7, NULL);

COMMIT;

select * from customer;

select * from admin;

select * from seller;