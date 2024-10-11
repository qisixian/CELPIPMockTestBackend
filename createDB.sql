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
    article_image           bytea,
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