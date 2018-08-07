# Blockchain-Based-Personal-Data-Decentralized-Storage

1.	Five core techniques Ire used in this project, Support Vector Machine(SVM), Post to Vector, Twitter API, Twitter4J, Key works Filtering.

2.	SVM: A Support Vector Machine (SVM) is a discriminative classifier formally defined by a separating hyperplane.  
In other words, given labeled training data (supervised learning), the algorithm outputs an optimal hyperplane which categorizes new examples.
In this case, I used Liblinear as the toolkit to accomplish using SVM as classifier. Liblinear is a very effective tool to train classifier model and use the model to classify all later posts.

3.	Post to Vector: I gather 7 attributes from the post: Hashtag count, mentions count, media count, URL count, Favorite Count, Retweet Count, Geo Locations. Then I transform these attributes into a vector, and put into the SVM.

4.	Twitter API: 

REST API:

Provide programmatic access to read and write Twitter data. Create a new Tweet, read user profile and follower data, and more. The REST API identifies Twitter applications and users using OAuth; responses are in JSON format.

Stream API:

Offer samples of the public data flowing through Twitter. Once applications establish a connection to a streaming endpoint, they are delivered a feed of Tweets, without needing to worry about polling or REST API rate limits.

5.Key Words Filtering
