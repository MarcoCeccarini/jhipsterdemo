


<!DOCTYPE html>
<html lang="en" class="">
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Language" content="en">
    
    
    <title>bootstrap-modal/README.md at master · jschr/bootstrap-modal · GitHub</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub">
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub">
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png">
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png">
    <meta property="fb:app_id" content="1401488693436528">

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="jschr/bootstrap-modal" name="twitter:title" /><meta content="bootstrap-modal - Extends the default Bootstrap Modal class. Responsive, stackable, ajax and more." name="twitter:description" /><meta content="https://avatars2.githubusercontent.com/u/1163252?v=3&amp;s=400" name="twitter:image:src" />
      <meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://avatars2.githubusercontent.com/u/1163252?v=3&amp;s=400" property="og:image" /><meta content="jschr/bootstrap-modal" property="og:title" /><meta content="https://github.com/jschr/bootstrap-modal" property="og:url" /><meta content="bootstrap-modal - Extends the default Bootstrap Modal class. Responsive, stackable, ajax and more." property="og:description" />
      <meta name="browser-stats-url" content="/_stats">
    <link rel="assets" href="https://assets-cdn.github.com/">
    
    <meta name="pjax-timeout" content="1000">
    

    <meta name="msapplication-TileImage" content="/windows-tile.png">
    <meta name="msapplication-TileColor" content="#ffffff">
    <meta name="selected-link" value="repo_source" data-pjax-transient>
      <meta name="google-analytics" content="UA-3769691-2">

    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="5BDAE005:68B7:2CCDE6:5513CD16" name="octolytics-dimension-request_id" />
    
    <meta content="Rails, view, blob#show" name="analytics-event" />

    
    <link rel="icon" type="image/x-icon" href="https://assets-cdn.github.com/favicon.ico">


    <meta content="authenticity_token" name="csrf-param" />
<meta content="J2eIuH6ntExdChmtS5cqUYrRj+ern5SoEEPovt0MVNWaBGVQWEFVFTxpZODmXbFClY4KiGIUoP6vpKBHzIEkAA==" name="csrf-token" />

    <link href="https://assets-cdn.github.com/assets/github-72aef5c1eab64bf684cb6f55513fae147b11b63503bf2311319ec22e77d3194f.css" media="all" rel="stylesheet" />
    <link href="https://assets-cdn.github.com/assets/github2-40d9bf14363443ccf64a2b71208f59e8739d6288d962feba121227e0608772f3.css" media="all" rel="stylesheet" />
    
    


    <meta http-equiv="x-pjax-version" content="16f1961eb9229a014751d96dc0a55124">

      
  <meta name="description" content="bootstrap-modal - Extends the default Bootstrap Modal class. Responsive, stackable, ajax and more.">
  <meta name="go-import" content="github.com/jschr/bootstrap-modal git https://github.com/jschr/bootstrap-modal.git">

  <meta content="1163252" name="octolytics-dimension-user_id" /><meta content="jschr" name="octolytics-dimension-user_login" /><meta content="5971563" name="octolytics-dimension-repository_id" /><meta content="jschr/bootstrap-modal" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="5971563" name="octolytics-dimension-repository_network_root_id" /><meta content="jschr/bootstrap-modal" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/jschr/bootstrap-modal/commits/master.atom" rel="alternate" title="Recent Commits to bootstrap-modal:master" type="application/atom+xml">

  </head>


  <body class="logged_out  env-production windows vis-public page-blob">
    <a href="#start-of-content" tabindex="1" class="accessibility-aid js-skip-to-content">Skip to content</a>
    <div class="wrapper">
      
      
      


        
        <div class="header header-logged-out" role="banner">
  <div class="container clearfix">

    <a class="header-logo-wordmark" href="https://github.com/" data-ga-click="(Logged out) Header, go to homepage, icon:logo-wordmark">
      <span class="mega-octicon octicon-logo-github"></span>
    </a>

    <div class="header-actions" role="navigation">
        <a class="btn btn-primary" href="/join" data-ga-click="(Logged out) Header, clicked Sign up, text:sign-up">Sign up</a>
      <a class="btn" href="/login?return_to=%2Fjschr%2Fbootstrap-modal%2Fblob%2Fmaster%2FREADME.md" data-ga-click="(Logged out) Header, clicked Sign in, text:sign-in">Sign in</a>
    </div>

    <div class="site-search repo-scope js-site-search" role="search">
      <form accept-charset="UTF-8" action="/jschr/bootstrap-modal/search" class="js-site-search-form" data-global-search-url="/search" data-repo-search-url="/jschr/bootstrap-modal/search" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
  <input type="text"
    class="js-site-search-field is-clearable"
    data-hotkey="s"
    name="q"
    placeholder="Search"
    data-global-scope-placeholder="Search GitHub"
    data-repo-scope-placeholder="Search"
    tabindex="1"
    autocapitalize="off">
  <div class="scope-badge">This repository</div>
</form>
    </div>

      <ul class="header-nav left" role="navigation">
          <li class="header-nav-item">
            <a class="header-nav-link" href="/explore" data-ga-click="(Logged out) Header, go to explore, text:explore">Explore</a>
          </li>
          <li class="header-nav-item">
            <a class="header-nav-link" href="/features" data-ga-click="(Logged out) Header, go to features, text:features">Features</a>
          </li>
          <li class="header-nav-item">
            <a class="header-nav-link" href="https://enterprise.github.com/" data-ga-click="(Logged out) Header, go to enterprise, text:enterprise">Enterprise</a>
          </li>
          <li class="header-nav-item">
            <a class="header-nav-link" href="/blog" data-ga-click="(Logged out) Header, go to blog, text:blog">Blog</a>
          </li>
      </ul>

  </div>
</div>



      <div id="start-of-content" class="accessibility-aid"></div>
          <div class="site" itemscope itemtype="http://schema.org/WebPage">
    <div id="js-flash-container">
      
    </div>
    <div class="pagehead repohead instapaper_ignore readability-menu">
      <div class="container">
        
<ul class="pagehead-actions">

  <li>
      <a href="/login?return_to=%2Fjschr%2Fbootstrap-modal"
    class="btn btn-sm btn-with-count tooltipped tooltipped-n"
    aria-label="You must be signed in to watch a repository" rel="nofollow">
    <span class="octicon octicon-eye"></span>
    Watch
  </a>
  <a class="social-count" href="/jschr/bootstrap-modal/watchers">
    274
  </a>

  </li>

  <li>
      <a href="/login?return_to=%2Fjschr%2Fbootstrap-modal"
    class="btn btn-sm btn-with-count tooltipped tooltipped-n"
    aria-label="You must be signed in to star a repository" rel="nofollow">
    <span class="octicon octicon-star"></span>
    Star
  </a>

    <a class="social-count js-social-count" href="/jschr/bootstrap-modal/stargazers">
      4,278
    </a>

  </li>

    <li>
      <a href="/login?return_to=%2Fjschr%2Fbootstrap-modal"
        class="btn btn-sm btn-with-count tooltipped tooltipped-n"
        aria-label="You must be signed in to fork a repository" rel="nofollow">
        <span class="octicon octicon-repo-forked"></span>
        Fork
      </a>
      <a href="/jschr/bootstrap-modal/network" class="social-count">
        895
      </a>
    </li>
</ul>

        <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
          <span class="mega-octicon octicon-repo"></span>
          <span class="author"><a href="/jschr" class="url fn" itemprop="url" rel="author"><span itemprop="title">jschr</span></a></span><!--
       --><span class="path-divider">/</span><!--
       --><strong><a href="/jschr/bootstrap-modal" class="js-current-repository" data-pjax="#js-repo-pjax-container">bootstrap-modal</a></strong>

          <span class="page-context-loader">
            <img alt="" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
          </span>

        </h1>
      </div><!-- /.container -->
    </div><!-- /.repohead -->

    <div class="container">
      <div class="repository-with-sidebar repo-container new-discussion-timeline  ">
        <div class="repository-sidebar clearfix">
            
<nav class="sunken-menu repo-nav js-repo-nav js-sidenav-container-pjax js-octicon-loaders"
     role="navigation"
     data-pjax="#js-repo-pjax-container"
     data-issue-count-url="/jschr/bootstrap-modal/issues/counts">
  <ul class="sunken-menu-group">
    <li class="tooltipped tooltipped-w" aria-label="Code">
      <a href="/jschr/bootstrap-modal" aria-label="Code" class="selected js-selected-navigation-item sunken-menu-item" data-hotkey="g c" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches /jschr/bootstrap-modal">
        <span class="octicon octicon-code"></span> <span class="full-word">Code</span>
        <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
</a>    </li>

      <li class="tooltipped tooltipped-w" aria-label="Issues">
        <a href="/jschr/bootstrap-modal/issues" aria-label="Issues" class="js-selected-navigation-item sunken-menu-item" data-hotkey="g i" data-selected-links="repo_issues repo_labels repo_milestones /jschr/bootstrap-modal/issues">
          <span class="octicon octicon-issue-opened"></span> <span class="full-word">Issues</span>
          <span class="js-issue-replace-counter"></span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
</a>      </li>

    <li class="tooltipped tooltipped-w" aria-label="Pull requests">
      <a href="/jschr/bootstrap-modal/pulls" aria-label="Pull requests" class="js-selected-navigation-item sunken-menu-item" data-hotkey="g p" data-selected-links="repo_pulls /jschr/bootstrap-modal/pulls">
          <span class="octicon octicon-git-pull-request"></span> <span class="full-word">Pull requests</span>
          <span class="js-pull-replace-counter"></span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
</a>    </li>

      <li class="tooltipped tooltipped-w" aria-label="Wiki">
        <a href="/jschr/bootstrap-modal/wiki" aria-label="Wiki" class="js-selected-navigation-item sunken-menu-item" data-hotkey="g w" data-selected-links="repo_wiki /jschr/bootstrap-modal/wiki">
          <span class="octicon octicon-book"></span> <span class="full-word">Wiki</span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
</a>      </li>
  </ul>
  <div class="sunken-menu-separator"></div>
  <ul class="sunken-menu-group">

    <li class="tooltipped tooltipped-w" aria-label="Pulse">
      <a href="/jschr/bootstrap-modal/pulse" aria-label="Pulse" class="js-selected-navigation-item sunken-menu-item" data-selected-links="pulse /jschr/bootstrap-modal/pulse">
        <span class="octicon octicon-pulse"></span> <span class="full-word">Pulse</span>
        <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
</a>    </li>

    <li class="tooltipped tooltipped-w" aria-label="Graphs">
      <a href="/jschr/bootstrap-modal/graphs" aria-label="Graphs" class="js-selected-navigation-item sunken-menu-item" data-selected-links="repo_graphs repo_contributors /jschr/bootstrap-modal/graphs">
        <span class="octicon octicon-graph"></span> <span class="full-word">Graphs</span>
        <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/assets/spinners/octocat-spinner-32-e513294efa576953719e4e2de888dd9cf929b7d62ed8d05f25e731d02452ab6c.gif" width="16" />
</a>    </li>
  </ul>


</nav>

              <div class="only-with-full-nav">
                  
<div class="clone-url open"
  data-protocol-type="http"
  data-url="/users/set_protocol?protocol_selector=http&amp;protocol_type=clone">
  <h3><span class="text-emphasized">HTTPS</span> clone URL</h3>
  <div class="input-group js-zeroclipboard-container">
    <input type="text" class="input-mini input-monospace js-url-field js-zeroclipboard-target"
           value="https://github.com/jschr/bootstrap-modal.git" readonly="readonly">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>

  
<div class="clone-url "
  data-protocol-type="subversion"
  data-url="/users/set_protocol?protocol_selector=subversion&amp;protocol_type=clone">
  <h3><span class="text-emphasized">Subversion</span> checkout URL</h3>
  <div class="input-group js-zeroclipboard-container">
    <input type="text" class="input-mini input-monospace js-url-field js-zeroclipboard-target"
           value="https://github.com/jschr/bootstrap-modal" readonly="readonly">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>



<p class="clone-options">You can clone with
  <a href="#" class="js-clone-selector" data-protocol="http">HTTPS</a> or <a href="#" class="js-clone-selector" data-protocol="subversion">Subversion</a>.
  <a href="https://help.github.com/articles/which-remote-url-should-i-use" class="help tooltipped tooltipped-n" aria-label="Get help on which URL is right for you.">
    <span class="octicon octicon-question"></span>
  </a>
</p>


  <a href="https://windows.github.com" class="btn btn-sm sidebar-button" title="Save jschr/bootstrap-modal to your computer and use it in GitHub Desktop." aria-label="Save jschr/bootstrap-modal to your computer and use it in GitHub Desktop.">
    <span class="octicon octicon-device-desktop"></span>
    Clone in Desktop
  </a>

                <a href="/jschr/bootstrap-modal/archive/master.zip"
                   class="btn btn-sm sidebar-button"
                   aria-label="Download the contents of jschr/bootstrap-modal as a zip file"
                   title="Download the contents of jschr/bootstrap-modal as a zip file"
                   rel="nofollow">
                  <span class="octicon octicon-cloud-download"></span>
                  Download ZIP
                </a>
              </div>
        </div><!-- /.repository-sidebar -->

        <div id="js-repo-pjax-container" class="repository-content context-loader-container" data-pjax-container>
          

<a href="/jschr/bootstrap-modal/blob/63568b7d95a3cc01034f7b858d3fd2571e1251ce/README.md" class="hidden js-permalink-shortcut" data-hotkey="y">Permalink</a>

<!-- blob contrib key: blob_contributors:v21:72f7718c03a038bfb5ba861b2e6e7694 -->

<div class="file-navigation js-zeroclipboard-container">
  
<div class="select-menu js-menu-container js-select-menu left">
  <span class="btn btn-sm select-menu-button js-menu-target css-truncate" data-hotkey="w"
    data-master-branch="master"
    data-ref="master"
    title="master"
    role="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <span class="octicon octicon-git-branch"></span>
    <i>branch:</i>
    <span class="js-select-button css-truncate-target">master</span>
  </span>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="select-menu-title">Switch branches/tags</span>
        <span class="octicon octicon-x js-menu-close" role="button" aria-label="Close"></span>
      </div>

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Filter branches/tags" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" data-filter-placeholder="Filter branches/tags" class="js-select-menu-tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" data-filter-placeholder="Find a tag…" class="js-select-menu-tab">Tags</a>
            </li>
          </ul>
        </div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <a class="select-menu-item js-navigation-item js-navigation-open "
               href="/jschr/bootstrap-modal/blob/gh-pages/README.md"
               data-name="gh-pages"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="gh-pages">
                gh-pages
              </span>
            </a>
            <a class="select-menu-item js-navigation-item js-navigation-open selected"
               href="/jschr/bootstrap-modal/blob/master/README.md"
               data-name="master"
               data-skip-pjax="true"
               rel="nofollow">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <span class="select-menu-item-text css-truncate-target" title="master">
                master
              </span>
            </a>
        </div>

          <div class="select-menu-no-results">Nothing to show</div>
      </div>

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/jschr/bootstrap-modal/tree/2.2.6/README.md"
                 data-name="2.2.6"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="2.2.6">2.2.6</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/jschr/bootstrap-modal/tree/2.2.5/README.md"
                 data-name="2.2.5"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="2.2.5">2.2.5</a>
            </div>
            <div class="select-menu-item js-navigation-item ">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/jschr/bootstrap-modal/tree/2.1.0/README.md"
                 data-name="2.1.0"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="2.1.0">2.1.0</a>
            </div>
        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div>

    </div>
  </div>
</div>

  <div class="btn-group right">
    <a href="/jschr/bootstrap-modal/find/master"
          class="js-show-file-finder btn btn-sm empty-icon tooltipped tooltipped-s"
          data-pjax
          data-hotkey="t"
          aria-label="Quickly jump between files">
      <span class="octicon octicon-list-unordered"></span>
    </a>
    <button aria-label="Copy file path to clipboard" class="js-zeroclipboard btn btn-sm zeroclipboard-button" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
  </div>

  <div class="breadcrumb js-zeroclipboard-target">
    <span class='repo-root js-repo-root'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/jschr/bootstrap-modal" class="" data-branch="master" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">bootstrap-modal</span></a></span></span><span class="separator">/</span><strong class="final-path">README.md</strong>
  </div>
</div>


  <div class="commit file-history-tease">
    <div class="file-history-tease-header">
        <img alt="Jordan Schroter" class="avatar" data-user="1163252" height="24" src="https://avatars0.githubusercontent.com/u/1163252?v=3&amp;s=48" width="24" />
        <span class="author"><a href="/jschr" rel="author">jschr</a></span>
        <time datetime="2015-03-17T14:26:27Z" is="relative-time">Mar 17, 2015</time>
        <div class="commit-title">
            <a href="/jschr/bootstrap-modal/commit/63568b7d95a3cc01034f7b858d3fd2571e1251ce" class="message" data-pjax="true" title="Update README.md">Update README.md</a>
        </div>
    </div>

    <div class="participation">
      <p class="quickstat">
        <a href="#blob_contributors_box" rel="facebox">
          <strong>4</strong>
           contributors
        </a>
      </p>
          <a class="avatar-link tooltipped tooltipped-s" aria-label="jschr" href="/jschr/bootstrap-modal/commits/master/README.md?author=jschr"><img alt="Jordan Schroter" class="avatar" data-user="1163252" height="20" src="https://avatars2.githubusercontent.com/u/1163252?v=3&amp;s=40" width="20" /></a>
    <a class="avatar-link tooltipped tooltipped-s" aria-label="msurguy" href="/jschr/bootstrap-modal/commits/master/README.md?author=msurguy"><img alt="Maksim Surguy" class="avatar" data-user="585833" height="20" src="https://avatars2.githubusercontent.com/u/585833?v=3&amp;s=40" width="20" /></a>
    <a class="avatar-link tooltipped tooltipped-s" aria-label="jahvi" href="/jschr/bootstrap-modal/commits/master/README.md?author=jahvi"><img alt="Javier Villanueva" class="avatar" data-user="661330" height="20" src="https://avatars0.githubusercontent.com/u/661330?v=3&amp;s=40" width="20" /></a>
    <a class="avatar-link tooltipped tooltipped-s" aria-label="bitdeli-chef" href="/jschr/bootstrap-modal/commits/master/README.md?author=bitdeli-chef"><img alt="Bitdeli Chef" class="avatar" data-user="3092978" height="20" src="https://avatars0.githubusercontent.com/u/3092978?v=3&amp;s=40" width="20" /></a>


    </div>
    <div id="blob_contributors_box" style="display:none">
      <h2 class="facebox-header">Users who have contributed to this file</h2>
      <ul class="facebox-user-list">
          <li class="facebox-user-list-item">
            <img alt="Jordan Schroter" data-user="1163252" height="24" src="https://avatars0.githubusercontent.com/u/1163252?v=3&amp;s=48" width="24" />
            <a href="/jschr">jschr</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Maksim Surguy" data-user="585833" height="24" src="https://avatars0.githubusercontent.com/u/585833?v=3&amp;s=48" width="24" />
            <a href="/msurguy">msurguy</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Javier Villanueva" data-user="661330" height="24" src="https://avatars2.githubusercontent.com/u/661330?v=3&amp;s=48" width="24" />
            <a href="/jahvi">jahvi</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Bitdeli Chef" data-user="3092978" height="24" src="https://avatars2.githubusercontent.com/u/3092978?v=3&amp;s=48" width="24" />
            <a href="/bitdeli-chef">bitdeli-chef</a>
          </li>
      </ul>
    </div>
  </div>

<div class="file">
  <div class="file-header">
    <div class="file-actions">

      <div class="btn-group">
        <a href="/jschr/bootstrap-modal/raw/master/README.md" class="btn btn-sm " id="raw-url">Raw</a>
          <a href="/jschr/bootstrap-modal/blame/master/README.md" class="btn btn-sm js-update-url-with-hash">Blame</a>
        <a href="/jschr/bootstrap-modal/commits/master/README.md" class="btn btn-sm " rel="nofollow">History</a>
      </div>

        <a class="octicon-btn tooltipped tooltipped-nw"
           href="https://windows.github.com"
           aria-label="Open this file in GitHub for Windows">
            <span class="octicon octicon-device-desktop"></span>
        </a>

          <button type="button" class="octicon-btn disabled tooltipped tooltipped-n" aria-label="You must be signed in to make or propose changes">
            <span class="octicon octicon-pencil"></span>
          </button>

        <button type="button" class="octicon-btn octicon-btn-danger disabled tooltipped tooltipped-n" aria-label="You must be signed in to make or propose changes">
          <span class="octicon octicon-trashcan"></span>
        </button>
    </div>

    <div class="file-info">
        158 lines (98 sloc)
        <span class="file-info-divider"></span>
      5.361 kb
    </div>
  </div>
    <div id="readme" class="blob instapaper_body">
    <article class="markdown-body entry-content" itemprop="mainContentOfPage"><p><strong>Note</strong>: Since this plugin was created to solve a lot of the issues with BS2, it still uses the BS2 markup syntax. Currently I believe the default BS3 modal addresses some of the bigger issues and is not worth maintaining two versions of this plugin.</p>

<h1>
<a id="user-content-bootstrap-modal-v226" class="anchor" href="#bootstrap-modal-v226" aria-hidden="true"><span class="octicon octicon-link"></span></a>Bootstrap Modal v2.2.6</h1>

<p>See live demo <a href="http://jschr.github.com/bootstrap-modal/">here</a>.</p>

<p>Extends Bootstrap's native modals to provide additional functionality. Introduces a <strong>ModalManager</strong> class that operates behind the scenes to handle multiple modals by listening on their events. </p>

<p>A single ModalManager is created by default on body and can be accessed through the jQuery plugin interface.</p>

<pre><code>$('body').modalmanager('loading');
</code></pre>

<p>Bootstrap-Modal can be used as a replacement for Bootstrap's Modal class or as a patch to the library.</p>

<h2>
<a id="user-content-bootstrap-3" class="anchor" href="#bootstrap-3" aria-hidden="true"><span class="octicon octicon-link"></span></a>Bootstrap 3</h2>

<p>If you're using BS3, I've provided a compatible css patch. Include <code>bootstrap-modal-bs3patch.css</code> <strong>before</strong> the main <code>bootstrap-modal.css</code> file to use this plugin with Bootstrap 3.</p>

<p>If you're using the loading spinner functionality you may also need to change the default template to be compatible in js:</p>

<pre><code>$.fn.modal.defaults.spinner = $.fn.modalmanager.defaults.spinner = 
    '&lt;div class="loading-spinner" style="width: 200px; margin-left: -100px;"&gt;' +
        '&lt;div class="progress progress-striped active"&gt;' +
            '&lt;div class="progress-bar" style="width: 100%;"&gt;&lt;/div&gt;' +
        '&lt;/div&gt;' +
    '&lt;/div&gt;';
</code></pre>

<h2>
<a id="user-content-overview" class="anchor" href="#overview" aria-hidden="true"><span class="octicon octicon-link"></span></a>Overview</h2>

<ul class="task-list">
<li>Backwards compatible</li>
<li>Responsive</li>
<li>Stackable</li>
<li>Full width</li>
<li>Load content via AJAX</li>
<li>Disable background scrolling</li>
</ul>

<h2>
<a id="user-content-installation-" class="anchor" href="#installation-" aria-hidden="true"><span class="octicon octicon-link"></span></a>Installation </h2>

<ul class="task-list">
<li>Include <code>css/bootstrap-modal.css</code> after the main bootstrap css files.</li>
<li>
<p>Include <code>js/bootstrap-modalmanager.js</code> and <code>js/bootstrap-modal.js</code> after the main bootstrap js files.</p>

<p>

</p>





</li>
</ul>

<h2>
<a id="user-content-options" class="anchor" href="#options" aria-hidden="true"><span class="octicon octicon-link"></span></a>Options</h2>

<p>In addition to the standard bootstrap options, you now have access to the following options</p>

<p><strong>Modal</strong></p>

<ul class="task-list">
<li><p><strong>width</strong>
Set the inital width of the modal.</p></li>
<li><p><strong>height</strong>
Set the inital height of the modal.</p></li>
<li><p><strong>maxHeight</strong>
Set the max-height of the modal-body.</p></li>
<li><p><strong>loading</strong>
Toggle the loading state.</p></li>
<li><p><strong>spinner</strong>
Provide a custom image or animation for the loading spinner.</p></li>
<li><p><strong>backdropTemplate</strong>
Provide a custom modal backdrop.</p></li>
<li><p><strong>consumeTab</strong>
Used to enable tabindexing for modals with <code>data-tabindex</code>. This is set to true by default.</p></li>
<li><p><strong>focusOn</strong>
The element or selector to set the focus to once the modal is shown.</p></li>
<li><p><strong>replace</strong>
If set to true, the modal will replace the topmost modal when opened.</p></li>
<li><p><strong>attentionAnimation</strong>
Set the animation used by the <code>attention</code> method. Any animation in <a href="http://daneden.me/animate/">animate.css</a> is supported but only the <em>shake</em> animation is included by default.</p></li>
<li><p><strong>modalOverflow</strong>
Set this property to true for modals with highly dynamic content. This will force the modal to behave as if it is larger than the viewport.</p></li>
<li><p><strong>manager</strong>
Set the modal's manager. By default this is set to the <code>GlobalModalManager</code> and will most likely not need to be overridden.</p></li>
</ul>

<p><strong>ModalManager</strong></p>

<ul class="task-list">
<li><p><strong>loading</strong>
Toggle the loading state.</p></li>
<li><p><strong>backdropLimit</strong>
Limit the amount of backdrops that will appear on the page at the same time.</p></li>
<li><p><strong>spinner</strong>
Provide a custom image or animation for the loading spinner.</p></li>
<li><p><strong>backdropTemplate</strong>
Provide a custom modalmanager backdrop. This backdrop is used when <code>$element.modalmanager('loading')</code> is called.</p></li>
</ul>

<h2>
<a id="user-content-disable-background-scrolling" class="anchor" href="#disable-background-scrolling" aria-hidden="true"><span class="octicon octicon-link"></span></a>Disable Background Scrolling</h2>

<p>If you want to prevent the background page from scrolling (see <a href="http://jschr.github.com/bootstrap-modal/">demo</a> for example) you must wrap the page contents in a <code>&lt;div class="page-container"&gt;</code>. For example:</p>

<pre><code>&lt;body&gt;
    &lt;div class="page-container"&gt;
        &lt;div class="navbar navbar-fixed-top"&gt;...&lt;/div&gt;
        &lt;div class="container"&gt;...&lt;/div&gt;
    &lt;/div&gt;
&lt;/body&gt;
</code></pre>

<p>The reason for doing this instead of just simply setting <code>overflow: hidden</code> when a modal is open is to avoid having the page shift as a result of the scrollbar appearing/disappearing. This also allows the document to be scrollable when there is a tall modal but only to the height of the modal, not the entire page.</p>

<h2>
<a id="user-content-constrain-modal-to-window-size" class="anchor" href="#constrain-modal-to-window-size" aria-hidden="true"><span class="octicon octicon-link"></span></a>Constrain Modal to Window Size</h2>

<p>You can bind the the height of the modal body to the window with something like this:</p>

<pre><code>$.fn.modal.defaults.maxHeight = function(){
    // subtract the height of the modal header and footer
    return $(window).height() - 165; 
}
</code></pre>

<p><strong>Note:</strong> This will be overwritten by the responsiveness and is only set when the modal is displayed, not when the window is resized.</p>

<h2>
<a id="user-content-tab-index-for-modal-forms" class="anchor" href="#tab-index-for-modal-forms" aria-hidden="true"><span class="octicon octicon-link"></span></a>Tab Index for Modal Forms</h2>

<p>You can use <code>data-tabindex</code> instead of the default <code>tabindex</code> to specify the tabindex within a modal.</p>

<pre><code>&lt;input type="text" data-tabindex="1" /&gt;
&lt;input type="text" data-tabindex="2" /&gt;
</code></pre>

<p>See the stackable example on the <a href="http://jschr.github.com/bootstrap-modal/">demo</a> page for an example.</p>

<p><a href="https://bitdeli.com/free" title="Bitdeli Badge"><img src="https://camo.githubusercontent.com/85d9709ce7e6ba910a21541a8ce6d44975c69507/68747470733a2f2f64327765637a68766c38323376302e636c6f756466726f6e742e6e65742f6a736368722f626f6f7473747261702d6d6f64616c2f7472656e642e706e67" alt="Bitdeli Badge" data-canonical-src="https://d2weczhvl823v0.cloudfront.net/jschr/bootstrap-modal/trend.png" style="max-width:100%;"></a></p>
</article>
  </div>

</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <form accept-charset="UTF-8" action="" class="js-jump-to-line-form" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" autofocus>
    <button type="submit" class="btn">Go</button>
</form></div>

        </div>

      </div><!-- /.repo-container -->
      <div class="modal-backdrop"></div>
    </div><!-- /.container -->
  </div><!-- /.site -->


    </div><!-- /.wrapper -->

      <div class="container">
  <div class="site-footer" role="contentinfo">
    <ul class="site-footer-links right">
        <li><a href="https://status.github.com/" data-ga-click="Footer, go to status, text:status">Status</a></li>
      <li><a href="https://developer.github.com" data-ga-click="Footer, go to api, text:api">API</a></li>
      <li><a href="https://training.github.com" data-ga-click="Footer, go to training, text:training">Training</a></li>
      <li><a href="https://shop.github.com" data-ga-click="Footer, go to shop, text:shop">Shop</a></li>
        <li><a href="https://github.com/blog" data-ga-click="Footer, go to blog, text:blog">Blog</a></li>
        <li><a href="https://github.com/about" data-ga-click="Footer, go to about, text:about">About</a></li>

    </ul>

    <a href="https://github.com" aria-label="Homepage">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
</a>
    <ul class="site-footer-links">
      <li>&copy; 2015 <span title="0.03237s from github-fe138-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="https://github.com/site/terms" data-ga-click="Footer, go to terms, text:terms">Terms</a></li>
        <li><a href="https://github.com/site/privacy" data-ga-click="Footer, go to privacy, text:privacy">Privacy</a></li>
        <li><a href="https://github.com/security" data-ga-click="Footer, go to security, text:security">Security</a></li>
        <li><a href="https://github.com/contact" data-ga-click="Footer, go to contact, text:contact">Contact</a></li>
    </ul>
  </div>
</div>


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-suggester-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="fullscreen-contents js-fullscreen-contents" placeholder=""></textarea>
      <div class="suggester-container">
        <div class="suggester fullscreen-suggester js-suggester js-navigation-container"></div>
      </div>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped tooltipped-w" aria-label="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped tooltipped-w"
      aria-label="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    
    

    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <a href="#" class="octicon octicon-x flash-close js-ajax-error-dismiss" aria-label="Dismiss error"></a>
      Something went wrong with that request. Please try again.
    </div>


      <script crossorigin="anonymous" src="https://assets-cdn.github.com/assets/frameworks-d22b59d0085e83b7549ba4341ec9e68f80c2f29c8e49213ee182003dc8d568c6.js"></script>
      <script async="async" crossorigin="anonymous" src="https://assets-cdn.github.com/assets/github-504dff3e8e0e391a1b545db0b1d117e086a912948fd385da44a23112ae1063a4.js"></script>
      
      

  </body>
</html>

