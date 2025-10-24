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

## stash 

