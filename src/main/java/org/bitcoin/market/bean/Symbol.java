package org.bitcoin.market.bean;

/**
 * Created by lichang on 14-2-26.
 */

public enum Symbol {
    btc {
        @Override
        public boolean isBtc() {
            return true;
        }

        @Override
        public boolean isLtc() {
            return false;
        }

        @Override
        public boolean isUsd() {
            return false;
        }

        @Override
        public boolean isAud() {
            return false;
        }
    }, ltc {
        @Override
        public boolean isBtc() {
            return false;
        }

        @Override
        public boolean isLtc() {
            return true;
        }

        @Override
        public boolean isUsd() {
            return false;
        }

        @Override
        public boolean isAud() {
            return false;
        }
    }, usd {
        @Override
        public boolean isBtc() {
            return false;
        }

        @Override
        public boolean isLtc() {
            return false;
        }

        @Override
        public boolean isUsd() {
            return true;
        }

        @Override
        public boolean isAud() {
            return false;
        }
    }, aud {
        @Override
        public boolean isBtc() {
            return false;
        }

        @Override
        public boolean isLtc() {
            return false;
        }

        @Override
        public boolean isUsd() {
            return false;
        }

        @Override
        public boolean isAud() {
            return true;
        }
    };

    public abstract boolean isBtc();

    public abstract boolean isLtc();

    public abstract boolean isUsd();

    public abstract boolean isAud();
}

