<?php

class Narancs
{
    private float $sargasag;
    private float $savanyusag;

    /**
     * @param float $sargasag
     * @param float $savanyusag
     */
    public function __construct(float $sargasag, float $savanyusag)
    {
        $this->setSargasag($sargasag);
        $this->setSavanyusag($savanyusag);
    }

    public function getSargasag(): float
    {
        return $this->sargasag;
    }

    public function setSargasag(float $sargasag): void
    {
        $this->sargasag = min(1,max($sargasag,0));
    }

    public function getSavanyusag(): float
    {
        return $this->savanyusag;
    }

    public function setSavanyusag(float $savanyusag): void
    {
        $this->savanyusag = min(1,max($savanyusag,0));
    }


}