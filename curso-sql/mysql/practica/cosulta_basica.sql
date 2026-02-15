USE twitter_db;

SELECT * FROM users;

SELECT * FROM followers;

SELECT * FROM tweets;

SELECT * FROM tweet_likes;

SELECT users.user_id, users.user_handle, users.first_name, following_id, COUNT(follower_id) AS seguidores
FROM followers
JOIN users ON users.user_id = following_id
GROUP BY following_id
ORDER BY seguidores DESC;

SELECT tweet_likes.user_id, u2.first_name, tweets.tweet_id, u1.first_name FROM tweets
JOIN tweet_likes ON tweet_likes.tweet_id = tweets.tweet_id
JOIN users u2 ON u2.user_id = tweet_likes.user_id 
JOIN users u1 ON u1.user_id = tweets.user_id
WHERE tweets.user_id = 1; 


