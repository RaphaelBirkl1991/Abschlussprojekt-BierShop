import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ProduktListeComponent} from "./produkt-liste/produkt-liste.component";
import {KopfzeileComponent} from "./kopfzeile/kopfzeile.component";
import {WarenkorbComponent} from "./warenkorb/warenkorb.component";
import {KundenListeComponent} from "./kunden-liste/kunden-liste.component";
import {HauptseiteComponent} from "./hauptseite/hauptseite.component";
import {ProduktBeschreibungComponent} from "./produkt-beschreibung/produkt-beschreibung.component";
import {WillkommenComponent} from "./willkommen/willkommen.component";
import {KarteikartenComponent} from "./karteikarten/karteikarten.component";
import {StellenangebotComponent} from "./stellenangebot/stellenangebot.component";
import {UeberUnsComponent} from "./ueber-uns/ueber-uns.component";
import {KontaktComponent} from "./kontakt/kontakt.component";
import {KaufAbschliessenComponent} from "./kauf-abschliessen/kauf-abschliessen.component";
import {KaufBestaetigungComponent} from "./kauf-bestaetigung/kauf-bestaetigung.component";
import {EmailBestaetigungComponent} from "./email-bestaetigung/email-bestaetigung.component";

const routes: Routes = [
  {path: '', component: HauptseiteComponent},
  {path: 'produkt_liste', component: ProduktListeComponent},
  {path: 'kopfzeile', component: KopfzeileComponent},
  {path: 'warenkorb', component: WarenkorbComponent},
  {path: 'kunden_liste', component: KundenListeComponent},
  {path: 'produkt_beschreibung', component: ProduktBeschreibungComponent},
  {path: 'willkommen', component: WillkommenComponent},
  {path: 'kopfzeile', component:KopfzeileComponent},
  {path: 'karteikarten', component:KarteikartenComponent},
  {path: 'stellenangebot', component: StellenangebotComponent},
  {path: 'ueber_uns', component: UeberUnsComponent},
  {path:'kontakt', component:KontaktComponent},
  {path: 'kauf_abschliessen', component: KaufAbschliessenComponent},
  {path: 'kauf_bestaetigung', component: KaufBestaetigungComponent},
  {path:'kontakt_formular', component: KontaktComponent},
  {path:'email_bestaetigung', component: EmailBestaetigungComponent}



];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
