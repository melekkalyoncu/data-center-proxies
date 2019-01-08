#!/usr/bin/env node
require('request-promise')({
   url: 'https://ifconfig.co/ip',
   proxy: 'http://username:pass@PROXY:PORT'
 }).then(function(data){ console.log(data); }, function(err){ console.error(err); });
