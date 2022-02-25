-- seed T_USER table
MERGE INTO T_USER AS TARGET
USING (
    SELECT
         ID
        ,CREATED_DATE
        ,UPDATED_DATE
        ,EMAIL
        ,FIRST_NAME
        ,LAST_NAME
        ,PASSWORD
        ,USERNAME
    FROM
        (
            VALUES
                 (1, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'watson@tsod.com', 'John H.', 'Watson', '12345', 'watson')
                ,(2, CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP(), 'sherlock@tsod.com', 'Sherlock', 'Holmes', '12345', 'sherlock')
        ) AS T_USER (ID
                    ,CREATED_DATE
                    ,UPDATED_DATE
                    ,EMAIL
                    ,FIRST_NAME
                    ,LAST_NAME
                    ,PASSWORD
                    ,USERNAME)
) AS SOURCE
ON (
        SOURCE.EMAIL = TARGET.EMAIL
    AND SOURCE.USERNAME = TARGET.USERNAME
)
WHEN NOT MATCHED THEN
    INSERT
    VALUES (SOURCE.ID
           ,SOURCE.CREATED_DATE
           ,SOURCE.UPDATED_DATE
           ,SOURCE.EMAIL
           ,SOURCE.FIRST_NAME
           ,SOURCE.LAST_NAME
           ,SOURCE.PASSWORD
           ,SOURCE.USERNAME);





-- seed T_POST table
