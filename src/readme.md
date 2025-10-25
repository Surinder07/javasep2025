## Branch 

branch is a pointer to the commit


master - original copy                                                          
    |
featureBranch 

Production  www.amazon.com
Staging     www.stag.amazon.com
QA / develop www.dev.amazon.com
Local env

## Staging


## branches
1. git branch branchName - to check the current branch 
2. git checkout branchName - to switch to another branch
3. git checkout -b branchName - to create and switch to another branch 
4. git branch -D test - to delete the branch 


## merging 
merge your changes to the other branch


master
  |
staging 
  |
feature

scenario : merge feature branch to staging 
we should be checked out on staging and then merge feature


master branch is locked
staging branch is locked 

In order to merge to staging or master, 
its done through a pull request(PR) / code review 
it requires approval of the team members 


## another line




## stash 
temporary store changes at a location and bring them back when needed 
git stash 
git stash pop = to bring back changes 


1. create a branch from staging, 
feature_Chetan 

and create a pull request which can be merge to staging



## revert 
revert back to the previous commit change, but does not change the history
git revert commit 


## reset 
revert back to the previous commit as per the commit id, and delete the commit completely 
git reset comimtid 


## rebase [read about it.]