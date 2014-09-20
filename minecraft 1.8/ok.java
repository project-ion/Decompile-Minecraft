/*   1:    */ import com.mojang.authlib.GameProfile;
/*   2:    */ 
/*   3:    */ final class ok
/*   4:    */   extends eg
/*   5:    */ {
/*   6:356 */   private boolean b = true;
/*   7:    */   
/*   8:    */   protected amj b(dz paramdz, amj paramamj)
/*   9:    */   {
/*  10:360 */     aqu localaqu = paramdz.i();
/*  11:361 */     ej localej = ave.b(paramdz.f());
/*  12:362 */     dt localdt = paramdz.d().a(localej);
/*  13:363 */     baj localbaj = aty.ce;
/*  14:365 */     if ((localaqu.d(localdt)) && (localbaj.b(localaqu, localdt, paramamj)))
/*  15:    */     {
/*  16:366 */       if (!localaqu.D)
/*  17:    */       {
/*  18:367 */         localaqu.a(localdt, localbaj.P().a(baj.a, ej.b), 3);
/*  19:368 */         bcm localbcm = localaqu.s(localdt);
/*  20:369 */         if ((localbcm instanceof bdm))
/*  21:    */         {
/*  22:370 */           if (paramamj.i() == 3)
/*  23:    */           {
/*  24:371 */             GameProfile localGameProfile = null;
/*  25:372 */             if (paramamj.n())
/*  26:    */             {
/*  27:373 */               fn localfn = paramamj.o();
/*  28:375 */               if (localfn.b("SkullOwner", 10)) {
/*  29:376 */                 localGameProfile = ga.a(localfn.m("SkullOwner"));
/*  30:377 */               } else if (localfn.b("SkullOwner", 8)) {
/*  31:378 */                 localGameProfile = new GameProfile(null, localfn.j("SkullOwner"));
/*  32:    */               }
/*  33:    */             }
/*  34:382 */             ((bdm)localbcm).a(localGameProfile);
/*  35:    */           }
/*  36:    */           else
/*  37:    */           {
/*  38:384 */             ((bdm)localbcm).a(paramamj.i());
/*  39:    */           }
/*  40:386 */           ((bdm)localbcm).b(localej.d().b() * 4);
/*  41:387 */           aty.ce.a(localaqu, localdt, (bdm)localbcm);
/*  42:    */         }
/*  43:389 */         paramamj.b -= 1;
/*  44:    */       }
/*  45:    */     }
/*  46:    */     else {
/*  47:392 */       this.b = false;
/*  48:    */     }
/*  49:395 */     return paramamj;
/*  50:    */   }
/*  51:    */   
/*  52:    */   protected void a(dz paramdz)
/*  53:    */   {
/*  54:400 */     if (this.b) {
/*  55:401 */       paramdz.i().b(1000, paramdz.d(), 0);
/*  56:    */     } else {
/*  57:403 */       paramdz.i().b(1001, paramdz.d(), 0);
/*  58:    */     }
/*  59:    */   }
/*  60:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ok
 * JD-Core Version:    0.7.0.1
 */