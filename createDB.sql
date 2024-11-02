create table reading_articles
(
    test_suite_id           integer not null,
    test_suite_name         varchar,
    practice_number         integer default 1,
    article_number          integer not null,
    article_uid             integer not null
        constraint reading_articles_pk
            primary key,
    article_title           varchar,
    article_instruction     varchar,
    article_content_1       text,
    article_image_id        integer,
    question_instruction_1  varchar,
    article_content_2_index integer,
    article_content_2       text,
    question_instruction_2  varchar
);

create table reading_questions
(
    article_uid      integer not null,
    question_number  integer not null,
    question_content varchar,
    choice_a         varchar,
    choice_b         varchar,
    choice_c         varchar,
    choice_d         varchar,
    choice_e         varchar,
    answer           varchar
);

create table media_files
(
    id   serial
        constraint media_files_pk
            primary key,
    name varchar,
    data bytea not null
);

insert into media_files(name, data) values ("111", pg_read_binary_file('/Users/sixian/Downloads/image111.png'));


create table "user"
(
    id          serial
        constraint user_pk
            primary key,
    username    varchar,
    email       varchar,
    password    varchar,
    role        varchar,
    create_by   integer,
    create_time date,
    update_by   integer,
    update_time date,
    is_enabled  boolean,
    is_deleted  boolean
);

CREATE TABLE oauth2_authorized_client (
    client_registration_id varchar(100) NOT NULL,
    principal_name varchar(200) NOT NULL,
    access_token_type varchar(100) NOT NULL,
    access_token_value bytea NOT NULL,
    access_token_issued_at timestamp NOT NULL,
    access_token_expires_at timestamp NOT NULL,
    access_token_scopes varchar(1000) DEFAULT NULL,
    refresh_token_value bytea DEFAULT NULL,
    refresh_token_issued_at timestamp DEFAULT NULL,
    created_at timestamp DEFAULT CURRENT_TIMESTAMP NOT NULL,
    PRIMARY KEY (client_registration_id, principal_name)
);
