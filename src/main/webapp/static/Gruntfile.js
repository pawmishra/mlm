'use strict';
module.exports = function (grunt) {
  // load all grunt tasks
  grunt.loadNpmTasks('grunt-contrib-less');
  grunt.loadNpmTasks('grunt-contrib-watch');
  grunt.loadNpmTasks('grunt-contrib-uglify');
  grunt.initConfig({
    watch: {
      // if any .less file changes in directory "build/less/" run the "less"-task.
      files: ["/static/build/less/*.less", "/static/build/less/skins/*.less", "/static/dist/js/app.js"],
      tasks: ["less", "uglify"]
    },
    // "less"-task configuration
    //this task will compile all less files upon saving to create both AdminLTE.css and AdminLTE.min.css
    less: {
      //Development not compressed
      development: {
        options: {
          //Wether to compress or not
          compress: false
        },
        files: {
          // compilation.css  :  source.less
          "/static/dist/css/AdminLTE.css": "/static/build/less/AdminLTE.less",
          "/static/dist/css/skins/skin-blue.css": "/static/build/less/skins/skin-blue.less",
          "/static/dist/css/skins/skin-black.css": "/static/build/less/skins/skin-black.less",
          "/static/dist/css/skins/skin-yellow.css": "/static/build/less/skins/skin-yellow.less",
          "/static/dist/css/skins/skin-green.css": "/static/build/less/skins/skin-green.less",
          "/static/dist/css/skins/skin-red.css": "/static/build/less/skins/skin-red.less",
          "/static/dist/css/skins/skin-purple.css": "/static/build/less/skins/skin-purple.less",
          "/static/dist/css/skins/_all-skins.css": "/static/build/less/skins/_all-skins.less"
        }
      },
      //production compresses version
      production: {
        options: {
          //Wether to compress or not          
          compress: true
        },
        files: {
          // compilation.css  :  source.less
          "/static/dist/css/AdminLTE.min.css": "/static/build/less/AdminLTE.less",
          "/static/dist/css/skins/skin-blue.min.css": "/static/build/less/skins/skin-blue.less",
          "/static/dist/css/skins/skin-black.min.css": "/static/build/less/skins/skin-black.less",
          "/static/dist/css/skins/skin-yellow.min.css": "/static/build/less/skins/skin-yellow.less",
          "/static/dist/css/skins/skin-green.min.css": "/static/build/less/skins/skin-green.less",
          "/static/dist/css/skins/skin-red.min.css": "/static/build/less/skins/skin-red.less",
          "/static/dist/css/skins/skin-purple.min.css": "/static/build/less/skins/skin-purple.less",
          "/static/dist/css/skins/_all-skins.min.css": "/static/build/less/skins/_all-skins.less"
        }
      }
    },
    //Uglify task info. Compress the js files.
    uglify: {
      options: {
        mangle: true,
        preserveComments: 'some'
      },
      my_target: {
        files: {
          '/static/dist/js/app.min.js': ['/static/dist/js/app.js']
        }
      }
    }
  });
  // the default task (running "grunt" in console) is "watch"
  grunt.registerTask('default', ['watch']);
};