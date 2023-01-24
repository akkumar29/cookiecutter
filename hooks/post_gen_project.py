from __future__ import print_function
from cookiecutter.main import cookiecutter

import os
import shutil


def main():

    main_app:"{{cookiecutter.__main_app }}"

    cookiecutter(
                    no_input=True,
                    overwrite_if_exists=True,
                    main_app
                )
if __name__ == '__main__':
    main()