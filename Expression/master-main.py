# -*- coding: utf-8 -*-
from flask import Flask, request,jsonify
from flask import render_template

import camera

UPLOAD_FOLDER = 'thumbnail_images'
app = Flask(__name__)

ALLOWED_EXTENSIONS = set(['png', 'jpg', 'mp4', 'bmp'])


def allowed_file(filename):
    return '.' in filename and \
           filename.rsplit('.', 1)[1].lower() in ALLOWED_EXTENSIONS


@app.after_request
def add_header(r):
    r.headers["Cache-Control"] = "no-cache, no-store, must-revalidate"
    r.headers["Pragma"] = "no-cache"
    r.headers["Expires"] = "0"
    r.headers['Cache-Control'] = 'public, max-age=0'
    return r


@app.after_request
def add_header(r):
    r.headers["Cache-Control"] = "no-cache, no-store, must-revalidate"
    r.headers["Pragma"] = "no-cache"
    r.headers["Expires"] = "0"
    r.headers['Cache-Control'] = 'public, max-age=0'
    return r


@app.route('/', methods=['GET'])
def helmet_detect():

    camera.start_app(0)

    response = jsonify({'detected': 'expression detected'})
    response.headers.add('Access-Control-Allow-Origin', '*')

    return response


@app.route('/getgraph', methods=['GET', 'POST'])
def graph_detect():
    camera.get_graph()


@app.after_request
def add_header(r):
    r.headers["Cache-Control"] = "no-cache, no-store, must-revalidate"
    r.headers["Pragma"] = "no-cache"
    r.headers["Expires"] = "0"
    r.headers['Cache-Control'] = 'public, max-age=0'
    return r


if __name__ == '__main__':
    app.run(port=5011)
